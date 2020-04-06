export class TelegramAuthenticationResponse {
  constructor(public id: string, public firstName: string, public lastName: string,
              public username: string, public photoUrl: string, public authDate: Date,
              public hash: string) {
  }
}
