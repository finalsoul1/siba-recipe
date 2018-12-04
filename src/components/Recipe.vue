<template>
<div class="">
  <div class="hello">
    <h1>{{ msg }}</h1>
  </div>
<b-container  >


<b-row sm="5">
  <div v-for="food in 15" :style="width='300px'">

      <b-col><b-img rounded v-bind:src="imgpath" alt="food1" class="rounded float-left" /></b-col>
      <b-col><h4 style=""  v-for>{{foodName}}</h4></b-col>
      <b-col><p style="width:300px;">{{ingredients}}</p></b-col>

  </div>
  </b-row>

</b-container>
</div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data() {
    return {
      imgpath: "http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00017_2.png",
      foodName: "고구마죽",
      ingredients: "고구마죽 고구마 100g(2/3개), 설탕 2g(1/3작은술), 찹쌀가루 3g(2/3작은술),물 200ml(1컵), 잣 8g(8알)"
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
