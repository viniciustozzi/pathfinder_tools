workflow "Build" {
  on = "push"
  resolves = ["Deploy to gh-pages"]
}

action "Package" {
  uses = "./action"
  args = "package"
}

action "Deploy to gh-pages" {
  uses = "JamesIves/github-pages-deploy-action@master"
  env = {
    BRANCH = "gh-pages"
    FOLDER = "public"
  }
  secrets = ["ACCESS_TOKEN"]
  needs = ["Package"]
}
