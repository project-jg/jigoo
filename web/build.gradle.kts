import com.moowork.gradle.node.task.NodeTask

plugins {
  id("com.moowork.node") version "1.2.0"
}

node {
  version = "10.2.1"
  download = true
}

val dev = task("dev", type = NodeTask::class) {
  dependsOn("npmInstall")

  setScript(project.file("node_modules/.bin/nuxt"))
}

tasks {
  dev
}
