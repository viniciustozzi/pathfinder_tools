workflow "Build" {
  on = "push"
  resolves = ["Package"]
}

action "Deps" {
  uses = "./action"
  args = "deps"
}

action "Package" {
  uses = "./action"
  args = "package"
  needs = ["Deps"]
}
