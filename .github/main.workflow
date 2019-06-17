workflow "Build" {
  on = "push"
  resolves = ["Deploy to pages"]
}

action "Test" {
  uses = "./.github/action"
  args = "test"
}

action "Package" {
  uses = "./.github/action"
  args = "package"
  needs = ["Test"]
}

action "Deploy to pages" {
  uses = "JamesIves/github-pages-deploy-action@master"
  env = {
    BRANCH = "gh-pages"
    FOLDER = "public"
  }
  secrets = ["ACCESS_TOKEN"]
  needs = ["Package"]
}
