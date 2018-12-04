<template>
  <div id="Loginview">
    <Login></Login>
  </div>
</template>
<script>
import Login from '@/components/Login.vue'

export default {
  name: 'Loginview',
  components: {
    Login
  }
}
</script>
<style scoped>
#Loginview {
  display:table;
  margin-left: auto;
  margin-right: auto;
}
</style>
