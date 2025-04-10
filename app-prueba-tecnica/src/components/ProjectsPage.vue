<template>
  <v-container class="py-8">
    <v-sheet color="green" class="pa-6 text-center" width="100%">
      <h1 class="text-h4 font-weight-bold mb-2 text-black">CREATE YOUR OWN PROJECT</h1>
      <p class="text-subtitle-1 text-black">Please fill in the form to add your project</p>
    </v-sheet>

    <v-form @submit.prevent="clickAddProject" class="mt-6">
      <v-label class="font-weight-medium">Project name:</v-label>
      <v-text-field
        v-model="projectName"
        variant="outlined"
        density="comfortable"
        hide-details
        class="mb-4"
      ></v-text-field>

      <v-label class="font-weight-medium">Project description:</v-label>
      <v-text-field
        v-model="projectDescription"
        variant="outlined"
        density="comfortable"
        hide-details
        class="mb-4"
      ></v-text-field>

      <v-btn color="black" class="text-white mb-2" type="submit" prepend-icon="mdi-plus">
        Add Project
      </v-btn>

      <div class="bg-green" style="height: 3px; width: 100%"></div>
    </v-form>

    <div
      class="d-flex flex-wrap justify-start mt-6"
      style="gap: 1.2% 1%; row-gap: 2rem"
    >
      <ProjectCard
        v-for="(project, index) in listProjectDto"
        :key="project.id"
        :title="project.title"
        :description="project.description"
      />
    </div>
  </v-container>
</template>

<script setup>
import { ref } from 'vue'
import axios from 'axios'
import ProjectCard from '@/components/ProjectCard.vue'

const projectName = ref('')
const projectDescription = ref('')

const listProjectDto = ref([
  {
    id: 1,
    title: "Project name",
    description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
  },
  {
    id: 2,
    title: "Project name",
    description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
  },
  {
    id: 3,
    title: "Project name",
    description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
  },
  {
    id: 4,
    title: "Project name",
    description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
  },
  {
    id: 5,
    title: "Project name",
    description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
  },
  {
    id: 6,
    title: "Project name",
    description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
  },
  {
    id: 7,
    title: "Project name",
    description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
  },
  {
    id: 8,
    title: "Project name",
    description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
  },
  {
    id: 9,
    title: "Project name",
    description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
  },
  {
    id: 10,
    title: "Project name",
    description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
  },
])

async function clickAddProject() {
  if (!projectName.value || !projectDescription.value) return

  const newProject = {
    title: projectName.value,
    description: projectDescription.value,
  }

  try {
    const response = await axios.post(
      'apppruebatecnica/projects/add',
      newProject
    )
    console.log('Project added:', response.data)

    listProjectDto.value.push({
      id: listProjectDto.value.length + 1,
      ...newProject,
    })

    projectName.value = ''
    projectDescription.value = ''
  } catch (error) {
    console.error('Error adding project:', error)
  }
}
</script>
