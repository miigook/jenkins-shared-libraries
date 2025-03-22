def call(){
emailext attachLog: true, 
    body: "Pipeline ran failedfailed ⛔️⛔️⛔️⛔️: ${JOB_URL}", 
        subject: "shared Library:failed ⛔️⛔️⛔️⛔️ job  ${JOB_NAME}, build number ${BUILD_NUMBER}", 
            to: 'abdoovahap@gmail.com'
}
