def git(repo)
{
  git'https://github.com/ajayhp07/${repo}git'
}

def mvn()
{
  sh'mvn package'
}

def deploy(jobname,ip,context)
{
  sh'scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war '
}

def test(jobname)
{
  sh'java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar'
}
