def newGit(repo)
{
  git "https://github.com/laxmikarna/${repo}.git"
}
def newMaven()
{
  sh 'mvn package'
}
