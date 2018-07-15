import com.moowork.gradle.node.task.NodeTask

plugins {
  id("com.moowork.node") version "1.2.0"
}

node {
  version = "10.6.0"
  download = true
}

val dev = task("dev", type = NodeTask::class) {
  group = "node"
  dependsOn("npmInstall")

  setScript(project.file("node_modules/.bin/nuxt"))
}

tasks {
  dev
}
