<template>
  <div class="Login">
    <div>
      <b-form @submit="onSubmit" @reset="onReset" v-if="show">
        <b-form-group id="exampleInputGroup1" label="Email address:" label-for="exampleInput1" description="귀하의 이메일을 절대로 공유하지 않습니다.">
          <b-form-input id="exampleInput1" type="email" v-model="form.email" required placeholder="Enter email"/>
        </b-form-group>
        
        <b-form-group id="exampleInputGroup2" label="Passward:" label-for="exampleInput2" description="8글자 이상">
          <b-form-input id="exampleInput2" type="password" v-model="form.pw" required placeholder="Enter password"/>
        </b-form-group>

        <b-form-group id="exampleInputGroup3" label="Your Name:" label-for="exampleInput3">
          <b-form-input id="exampleInput3" type="text" v-model="form.name" required placeholder="Enter name"/>
        </b-form-group>

        <b-form-group id="exampleInputGroup4" label="Gender:" label-for="exampleInput4">
          <b-form-select id="exampleInput4" :options="genders" required v-model="form.gender"/>
        </b-form-group>

        <!-- <b-form-group id="exampleGroup4">
          <b-form-checkbox-group v-model="form.checked" id="exampleChecks">
            <b-form-checkbox value="me">Check me out</b-form-checkbox>
            <b-form-checkbox value="that">Check that out</b-form-checkbox>
          </b-form-checkbox-group>
        </b-form-group> -->

        <b-button type="submit" variant="primary">Submit</b-button>
        <b-button type="reset" variant="danger">Reset</b-button>

      </b-form>
    </div>
  </div>
</template>
<script>
export default {
  name: 'Login',
  data() {
    return {
      form: {
        email: '',
        pw:'',
        name: '',
        food: '',
        checked: []
      },
      genders: [
        { text: '성별을 고르세요', value: null },
        'man', 'woman'
      ],
      show: true
    }
  },
  methods: {
    onSubmit(evt) {
      evt.preventDefault()
      alert(JSON.stringify(this.form))
    },
    onReset(evt) {
      evt.preventDefault()
      /* Reset our form values */
      this.form.email = ''
      this.form.name = ''
      this.form.food = ''
      this.form.checked = []
      /* Trick to reset/clear native browser form validation state */
      this.show = false
      this.$nextTick(() => { this.show = true })
    }
  }
}
</script>

<style scoped>
/* .Login {
  max-width:500px;
  max-height:500px;
} */
</style>