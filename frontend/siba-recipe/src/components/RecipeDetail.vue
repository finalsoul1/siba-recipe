<template>

<div class="detailpage">
  <!-- <container> -->

    <b-row sm="1">
      <b-img center  v-bind:src="posts.food.bigImageLocation" alt="food1" class="big" />
    </b-row>

    <br>
    <br>

    <b-row align-h="center">
      <h1 class="h1">{{posts.food.name}}</h1>
    </b-row>
    <br>
    <b-row align-h="center">

    <h2  class="h2ingre" style="width:470px">{{posts.food.ingredients}}</h2>

    </b-row>

    <br>
    <br>
    <br>
    <br>
    <br>
    <br>

    <div  v-for="recipes in posts.recipes" :key="recipes.id" >
      <ul class="list">

        <b-row>
          <b-img center v-bind:src="recipes.imageLocation" alt="조리과정사진이 없습니다." class="recipeimage" width="500" height="300"/>
        </b-row>

        <br>
        <b-row align-h="center">
          <li>{{recipes.recipeDesc}}</li>
        </b-row>
      </ul>
      <hr>
    </div>

  <!-- </container> -->
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
      baseUrl: 'http://localhost:7777/food/detail',
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
.list{
  font-size: 40px
}
.h1{
font-size: 50px;
}
.h2ingre{
border-left:  3px solid #ff9900;
padding-left: 10px;
}
.recipeimage{
  border:  1px solid #e6e6e6;
}

</style>
