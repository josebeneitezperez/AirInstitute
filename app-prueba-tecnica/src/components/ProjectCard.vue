<template>
  <v-card class="rounded-lg" :style="{ width: '19%' }">
    <v-img
      :src="bambooImage"
      height="160"
      cover
      class="rounded-t-lg"
    ></v-img>

    <v-card-text>
      <h3 class="font-weight-bold text-subtitle-1 mb-2">{{ title }}</h3>
      <p class="text-body-2">{{ description }}</p>
    </v-card-text>
  </v-card>
</template>

<script setup>
import bambooImage from '@/assets/img/bambu_kazuend.jpg'

defineProps({
  title: String,
  description: String,
})
</script>
