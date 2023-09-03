import http from 'k6/http';
import { sleep } from 'k6';

export const options = {
    duration: '10s',
    vus: 100
}

export default function () {
    http.get('http://localhost:5000/api/films')
    sleep(1)
}
