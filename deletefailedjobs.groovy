def jobName = 'job' // Replace job name in quotes 
Jenkins.instance.getItemByFullName(jobName).builds.findAll { it.result == Result.FAILURE}.each { it.delete() }
