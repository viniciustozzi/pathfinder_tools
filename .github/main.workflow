workflow "Build" {
  on = "push"
  resolves = ["ls"]
}

action "Package" {
  uses = "./action"
  args = "package"
}

action "ls" {
  uses = "./action"
  needs = ["Package"]
  runs = "ls"
  args = "-a"
}
