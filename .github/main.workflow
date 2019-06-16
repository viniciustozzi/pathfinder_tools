workflow "Build" {
  on = "push"
  resolves = ["Package"]
}

action "Package" {
  uses = "./action"
  args = "package"
}
