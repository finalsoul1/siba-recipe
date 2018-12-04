<template>
  <div id="app">
    <div id="nav">
      <b-button-group>
        <b-button>
          <router-link to="/">Home</router-link>
        </b-button>
        <b-button>
          <router-link to="/about">About</router-link>
        </b-button>
        <b-button>
          <router-link to="/login">login</router-link>
        </b-button>
      </b-button-group>
    </div>
    <router-view />
  </div>
</template>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
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
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #f9faf9;
}
</style>
