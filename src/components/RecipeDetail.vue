<template>
<div id="detail" align="center">
  <b-container >


    <b-row>
      <b-img  v-bind:src="posts.food.bigImageLocation" alt="food1" class="rounded float-left" />
    </b-row>

    <b-row>
      <h4 >{{posts.food.name}}</h4>
    </b-row>

    <b-row>
      <p style="width:300px;">{{posts.food.ingredients}}</p>
    </b-row>
    <br>
    <div class="col-md-4 col-lg4" v-for="recipes in posts.recipes" :style="width='300px'">

      <ul class="mb-30">
        <b-row>
          <b-col></b-col>
          <b-img rounded v-bind:src="recipes.imageLocation" alt="No Photo" class="rounded float-left" /><br>
          </b-col>

          <b-row><br>
             <li>{{recipes.recipeDesc}}</li>
          </b-row>
        </b-row>
        <hr>


      </ul>

    </div>

  </b-container>
</div>
</template>
<script>
import axios from 'axios'

export default {

  name: 'HelloWorld',
  props: {
    // msg: String,

  },
  data() {
    return {
      posts: [],
      errors: [],
      baseUrl: 'http://localhost:8080/food/detail',
      foodId:1
    }
  },
methods:{

},
created(){

    axios.get(this.baseUrl, {
        params: {
          foodId:100
        }

      })
      .then(response => {
        this.posts = response.data
        console.log(posts[0]);
      })
      .catch(e => {
        this.errors.push(e)
      })
    }

}
</script>
<style scoped>
</style>
