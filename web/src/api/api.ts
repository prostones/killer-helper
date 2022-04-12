import request from '@/utils/request'

enum Api {
  GetTreeList = '/data/form/tree'
}

export const getTreeList = (params?: any) => {
  return request.get<any>(Api.GetTreeList, params);
};