<template>
<div class="detail">
  <container class="recipedetail">

    <b-row sm="1">
      <b-img center  v-bind:src="posts.food.bigImageLocation" alt="food1" class="big" />
    </b-row>

    <br>
    <br>

    <b-row align-h="center">
      <h4>{{posts.food.name}}</h4>
    </b-row>

    <br>

    <b-row align-h="center">
      <p style="width:470px">{{posts.food.ingredients}}</p>
    </b-row>

    <br>

    <div class="" v-for="recipes in posts.recipes">
      <ul class="list">

        <b-row>
          <b-img center v-bind:src="recipes.imageLocation" alt="조리과정사진이 없습니다." class="rounded float-left" width="500" height="300"/>
        </b-row>

        <br>
        <b-row align-h="center">
          <li>{{recipes.recipeDesc}}</li>
        </b-row>
      </ul>
      <hr>
    </div>

  </container>
</div>
</template>
<script>
import axios from 'axios'

export default {
  name: 'HelloWorld',
  data() {
    return {
      posts: {
        food: {
          bigImageLocation: '',
          ingredients: ''
        }
      },
      errors: [],
      baseUrl: 'http://192.168.0.15:8080/food/detail',
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
.big{
  border-radius: 50px
}
</style>
