workflow "Build" {
  on = "push"
  resolves = ["GitHub Action for lein"]
}

action "GitHub Action for lein" {
  uses = "./action"
  runs = "lein"
  args = "deps"
}
