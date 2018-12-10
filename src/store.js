import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)
export const store = new Vuex.Store({
  state: {
    foodid: 1
  },
  getters: {
    getFoodid: function (state) {
      return state.foodid
    }
  },
  mutations: {
    foodid: function (state, payload) {
      state.foodid = this.id
      return state.fooodid
    }
  }
})
