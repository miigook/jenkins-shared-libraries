def call(){
emailext attachLog: true, 
    body: 'Pipeline ran successfully: ${JOB_URL}', 
        subject: 'shared Library:success job  ${JOB_NAME}, build number ${BUILD_NUMBER}', 
            to: 'abdoovahap@gmail.com'
}
