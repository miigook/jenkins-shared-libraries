def call(String name){
    if (currentBuild.result) == 'SUCCESS'{
        emailext attachLog: true, 
        body: "Pipeline ran successfully: ${JOB_URL}", 
        subject: "shared Library:success job  ${JOB_NAME}, build number ${BUILD_NUMBER}", 
            to: 'abdoovahap@gmail.com'
    }
    else if (currentBuild.result == "FAILURE"){
        emailext attachLog: true, 
        body: "Pipeline ran failedfailed ⛔️⛔️⛔️⛔️: ${JOB_URL}", 
        subject: "shared Library:failed ⛔️⛔️⛔️⛔️ job  ${JOB_NAME}, build number ${BUILD_NUMBER}", 
        to: 'abdoovahap@gmail.com'
    }
    else {
        emailext attachLog: true, 
        body: "Pipeline ran to unknown: ${JOB_URL}", 
        subject: "unknown 🟡🟡🟡🟡 ${JOB_NAME}, build number ${BUILD_NUMBER}", 
        to: 'abdoovahap@gmail.com'
    }
}