SET datetime=%date:~0,4%%date:~5,2%%date:~8,2%-%time:~0,2%%time:~3,2%%time:~6,2%
SET datetime=%datetime: =0%

docker build -t pro4stones/killer-helper:%datetime% .
docker push pro4stones/killer-helper:%datetime%

docker tag pro4stones/killer-helper:%datetime% pro4stones/killer-helper:latest
docker push pro4stones/killer-helper:latest