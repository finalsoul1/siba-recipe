import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export const store = new Vuex.Store({
  state: {
    foodid: 5
  },
  getters: {
    getFoodid (state) {
      return state.foodid
    }
  },
  mutations: {
    foodid (state, payload) {
      state.foodid = payload
    }
  }
})
