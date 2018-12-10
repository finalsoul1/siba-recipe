<template>
  <div id="detail">
    <b-container class="recipedetail">

      <b-row sm="1">
        <b-img v-bind:src="posts.food.bigImageLocation" alt="food1" class="rounded float-left"/>
      </b-row>

      <b-row>
        <h4>{{posts.food.name}}</h4>
      </b-row>

      <b-row>
        <p style="width:300px;">{{posts.food.ingredients}}</p>
      </b-row>

      <br>
      <div class="col-md-4 col-lg4" v-for="recipes in posts.recipes" :style="width='300px'">
        <ul class="mb-30">
          <b-row>
            <b-col>
            <b-img rounded v-bind:src="recipes.imageLocation" alt="No Photo" class="rounded float-left"/>
            <br>
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
  data() {
    return {
      posts: {
        food:{
          bigImageLocation: '',
          ingredients:''
        }
      },
      errors: [],
      baseUrl: 'http://localhost:8080/food/detail',
    }
  },
  created() {
    console.log(this.$store.getters.getFoodid);
    
    axios.get(this.baseUrl, {
      params: {
        foodId: this.$store.getters.getFoodid
      }
    })
      .then(response => {
        this.posts = response.data
      })
      .catch(e => {
        this.errors.push(e)
      })
  }

}
</script>
<style scoped>
</style>
