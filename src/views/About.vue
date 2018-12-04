<template>
  <div class="about">
    <h1>This is an about page</h1>
    <Favorites msg="즐겨찾기"/>
  </div>
</template>

<script>
// @ is an alias to /src
import Favorites from '@/components/Favorites.vue'

export default {
  name: 'about',
  components: {
    Favorites
  }
}
</script>
<style scoped>

</style>
