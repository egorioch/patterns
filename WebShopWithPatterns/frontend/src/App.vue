<template>
  <div id="app">
    <navbar-component></navbar-component>
  </div>

  <router-view />
</template>

<script setup>
import NavbarComponent from "@/components/NavbarComponent.vue";
</script>