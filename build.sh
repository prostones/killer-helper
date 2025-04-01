
docker login -u pro4stones -p dckr_pat_dePZpZqEKe2yzO9J_ZACsFStCsg
datetime=$(date +"%Y%m%d-%H%M%S")
docker build -t pro4stones/killer-helper:$datetime .
docker push pro4stones/killer-helper:$datetime

docker tag pro4stones/killer-helper:$datetime pro4stones/killer-helper:latest
docker push pro4stones/killer-helper:latest