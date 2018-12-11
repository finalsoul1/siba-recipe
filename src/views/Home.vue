<template>
<div class="home">
    <Recipe msg="Seon hui's Recipe" />
  </div>
</template>


<script>
// @ is an alias to /src
import Recipe from '@/components/Recipe.vue'

export default {
  name: 'home',

  components: {
    Recipe
  },


}
</script>
<style scoped>
</style>
