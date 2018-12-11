<template>
  <div id="app">
    <div id="nav">
      <b-button-group class="button">
        <b-button variant="warning" >
          <router-link to="/food/list">Home</router-link>
        </b-button>
        <b-button variant="warning" >
          <router-link to="/searchpage">검색</router-link>
        </b-button>
      </b-button-group>
    </div>
    <router-view />
  </div>
</template>


<script>
export default {
  created(){
    this.$router.push({name:"home"})
  }
}
</script>

<style>
#app {
  /* font-family: "Avenir", Helvetica, Arial, sans-serif; */
  /* font-family: 'Gamja Flower', cursive; */
  /* font-family: 'Cute Font', cursive; */
  font-family: 'Hi Melody', cursive;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;

}
#nav {
  padding: 30px;


}

#nav a {
  font-weight: bold;
  font-size: 50px;

  color: #fff;

}

#nav a.router-link-exact-active {
  color: #2c3e50;
}

</style>
