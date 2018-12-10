<template>

  <div class="">
    <div class="hello">
      <h1>{{ msg }}</h1>
    </div>
    <b-container>
      <b-row sm="3">
        <div class="col-md-4 col-lg4" v-for="list in posts.list" :style="width='300px'">
          <b-col>
            <b-img
              rounded
              v-bind:src="list.smallImageLocation"
              alt="food1"
              class="rounded float-left"
            />
          </b-col>
          <b-col>
            <a class="gotoDetail" href="#" @click.prevent="foodid(list.id)">
              <h4>{{list.name}}</h4>
            </a>
          </b-col>
          <b-col>
            <p style="width:300px;">{{list.ingredients}}</p>
          </b-col>
        </div>
      </b-row>
      <b-pagination-nav align="center" size="md" :link-gen="linkGen" :number-of-pages="63" v-model="currentPage"/>
      <div class="mt-4">currentPage:{{currentPage}}</div>
    </b-container>
  </div>
</template>
<!-- :use-router="true" -->
<!-- <script src="https://cdn.jsdelivr.net/npm/vue@2.5.2/dist/vue.js"></script>
  <script src="https://unpkg.com/axios/dist/axios.min.js"></script> -->

<script>
import axios from 'axios'

// import pagination from 'vue-bootstrap-pagination'
export default {

  name: 'HelloWorld',
  props: {
    msg: String
  },
  data() {
    return {
      posts: [],
      errors: [],
      currentPage: 1,
      baseUrl: 'http://localhost:8080/food/list',
    }
  },
  methods: {
    linkGen(currentPage) {
      axios.get(this.baseUrl, {
          params: {
            page: currentPage
          }
        })
          .then(response => {
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      return {
        path: '/food/list/?page=' + currentPage
      } 
    },
    foodid(id) {
      console.log(id);
      this.$store.commit('foodid', id)
      this.$router.push({ name:'recipedetail' })
    }
  },

}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
