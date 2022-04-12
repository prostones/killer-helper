export interface Game {
  code: string;
  id: string;
  players: Players[];
  title: string;
  total: number | string;
}

export interface Players {
  number: string | number;
  role: Role
}

export interface Role {
  code: string;
  description: string;
  goodMan: boolean;
}