import request from '@/utils/request'

enum Api {
  CreateRoom = '/api/admin/create/',
  BackRoom = '/api/admin/coming/',
  ComingRoom = '/api/player/coming/',
}

export const createRoom = (total: string) => {
  return request.post<any>(Api.CreateRoom + total);
};
export const backRoom = (code: string) => {
  return request.post<any>(Api.BackRoom + code);
};
export const comingRoom = (code: string, number: string) => {
  return request.post<any>(Api.ComingRoom + code + '/' + number);
};