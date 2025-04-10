<template>
  <v-app>
    <v-app-bar>
      <v-tabs v-model="tab">
        <v-tab value="HomePage">HomePage</v-tab>
        <v-tab value="projects">Projects</v-tab>
      </v-tabs>
    </v-app-bar>

    <v-main>
      <v-window v-model="tab">
        <v-window-item value="HomePage" >
          <HomePage />
        </v-window-item>
        <v-window-item value="projects">
          <Projects />
        </v-window-item>
      </v-window>
    </v-main>
  </v-app>
</template>

<script setup>
import { ref } from 'vue'
import HomePage from '@/components/HomePage.vue'
import Projects from '@/components/ProjectsPage.vue'

const tab = ref('HomePage')
</script>
