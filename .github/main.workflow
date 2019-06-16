workflow "Build" {
  on = "push"
  resolves = ["Package"]
}

action "Package" {
  uses = "./action"
  args = "package"
}

action "ls" {
  uses = "./action"
  run = "ls"
  needs = ["Package"]
}
