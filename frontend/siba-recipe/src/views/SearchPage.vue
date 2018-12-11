<template>
<div class="search">
    <searchComponents msg="검색화면" />
  </div>
</template>


<script>
// @ is an alias to /src
import searchComponents from '@/components/seachComponents.vue'

export default {
  name: 'searchpage',

  components: {
    searchComponents
  },


}
</script>
<style scoped>
</style>
