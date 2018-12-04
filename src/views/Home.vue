<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/bono.jpg">
    <Recipe msg="시바레시피"/>
  </div>
</template>

<script>
// @ is an alias to /src
import Recipe from '@/components/Recipe.vue'

export default {
  name: 'home',
  components: {
    Recipe
  }
}
</script>
<style scoped>

</style>
