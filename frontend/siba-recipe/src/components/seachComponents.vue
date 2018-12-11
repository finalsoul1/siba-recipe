<template>
<div class="">
<p>{{msg}}</p>
</div>
</template>
<script>
import axios from 'axios'

  export default {

    name: 'HelloWorld',
    props: {
      msg: String
    },data() {
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
}
</script>
<style scoped>

</style>
