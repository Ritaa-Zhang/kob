<template>
  <NavBar />
  <router-view/>
</template>

<script>
import NavBar from './components/NavBar.vue';
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap";
// import $ from 'jquery';

export default {
  components: {
    NavBar
  },

  setup() {
    // $.ajax({
    //   url: "http://127.0.0.1:8080/user/account/token/",
    //   type: "post",
    //   data: {
    //     username: 'zrj',
    //     password: 'p2',
    //   },
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp); 
    //   }
    // });

    // $.ajax({
    //   url: "http://127.0.0.1:8080/user/account/info/",
    //   type: "get",
    //   headers: {
    //     Authorization: "Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJmNGI5OGM0MGIwNDc0YzBlODM5ZDllYTA0MjkwYzM2MCIsInN1YiI6IjIiLCJpc3MiOiJzZyIsImlhdCI6MTY2NDQxMjIyMCwiZXhwIjoxNjY1NjIxODIwfQ.3PCZSwUJ-0Yj6ct0PBf2vwVSfNYYhI9UIpHbjpYHsyQ",
    //   },
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp); 
    //   }
    // });

    // $.ajax({
    //   url: "http://127.0.0.1:8080/user/account/register/",
    //   type: "post",
    //   data: {
    //     username: 'zrj2',
    //     password: 'pzrj',
    //     confirmedPassword: 'pzrj',
    //   },
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp); 
    //   }
    // });
  }
}
</script>

<style>
body {
  background-image: url("./assets/images/background.png");
  background-size: cover;
  /* background-repeat: no-repeat; */
}
</style>
