<template>
  <div class="home">

    <RecipeDetail msg='디테일' />
  </div>
</template>

<script>
// @ is an alias to /src
import RecipeDetail from '@/components/RecipeDetail.vue'

export default {
  name: 'recipedetail',
  components: {
    RecipeDetail
  }
}
</script>
<style scoped>

</style>
