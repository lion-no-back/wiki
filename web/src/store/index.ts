import { createStore } from 'vuex'

const store = createStore({
  state: {
    user: {}
  },
  mutations: {
    setUser (state, user) {
      console.log(state, user);
      state.user = user;
    }
  },
  actions: {
  },
  modules: {
  }
})

export default store;