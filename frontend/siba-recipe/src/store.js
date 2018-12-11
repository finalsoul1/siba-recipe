import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export const store = new Vuex.Store({
  state: {
    foodid: 5,
    // searchstring:'감자'
  },
  getters: {
    getFoodid (state) {
      return state.foodid
    },
    // getSearchstring(state){
    //   return state.searchstring;
    // }
  },
  mutations: {
    foodid (state, payload) {
      state.foodid = payload
    },

  }
})
