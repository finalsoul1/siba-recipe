<template>
<div class="">
  <div class="hello">
    <h1>{{ msg }}</h1>
  </div>

  <div v-for="food in 10">
    <div class="food">
    <div class="row">
      <div class="col-4">
        <img v-bind:src="imgpath" alt="food1" class="rounded float-left" />
        <h4 v-for>{{foodName}}</h4>
        <p>{{ingredients}}</p>
      </div>
    </div>

    </div>
  </div>

  <div class="content">

  </div>
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
