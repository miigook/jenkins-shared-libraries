def call(SUCCESS,FAILURE){
    if emailSendSuccess() == 'SUCCESS'{
        emailext
    }
    else if (emailSendFailure() == "FAILURE"){
        emailext
    }
    else {
        emailext
    }
}