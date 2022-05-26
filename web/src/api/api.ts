import request from '@/utils/request'

enum Api {
  CreateRoom = '/api/admin/create/',
  BackRoom = '/api/admin/coming/',
  ComingRoom = '/api/player/coming/',
  QueryGameBook = '/api/game/book/list',
  CreateByGameBookId = '/api/admin/create/by/',
}

export const createRoom = (total: string) => {
  return request.post<any>(Api.CreateRoom + total);
};
export const createByGameBookId = (gameBookId: string, isBdModel: boolean) => {
  return request.post<any>(`${Api.CreateByGameBookId}${gameBookId}?isBdModel=${isBdModel}`);
};
export const backRoom = (code: string) => {
  return request.post<any>(Api.BackRoom + code);
};
export const comingRoom = (code: string, number: string) => {
  return request.post<any>(Api.ComingRoom + code + '/' + number);
};
export const queryGameBook = () => {
  return request.get<any>(Api.QueryGameBook);
};