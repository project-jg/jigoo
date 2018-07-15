<template>
  <div>
    <h1>chat</h1>
    {{project.data}}
  </div>
</template>

<script>
  import axios from 'axios'

  export default {
    name: "index",
    async asyncData (context) {
      return { project:
        await axios.get('/api/hello')
      }
    }
  }
</script>

<style scoped>

</style>
