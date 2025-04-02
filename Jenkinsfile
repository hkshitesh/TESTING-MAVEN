pipeline
{
	agent any
	tools
	{
		maven 'MAVEN_HOME'
	}
	
	stages
	{
		stage('Welcome Stage')
		{
			steps
			{
				echo 'Welcome to Jenkins Pipeline'
			}
		}	
			
		
		stage('Build Stage')
		{
			steps
			{
				bat 'mvn install'
			}
		}
		stage('Build Success')
		{
			steps
			{
				echo 'Build Successful'
			}
		}
	}
}	