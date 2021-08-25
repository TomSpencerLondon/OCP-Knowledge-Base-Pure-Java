const app = require('../../setup/app.setup');
const { expect } = require('../../setup/chai.setup');

describe('/api/v1', function () {
    describe('/players', function () {
        describe('GET', function () {
            it('returns 200 and a body listing all players', async function () {
                const res = await app().get('/api/v1/players');
                expect(res.status).to.equal(200);
                expect(res.body).to.be.an('array');
                expect(res.body).to.deep.equal([{name: 'craig'}]);
            });
        });

        describe('/{id}', function () {
            describe('GET', function () {
                describe(`with valid 'id' param`, function () {
                    const playerName = 'craig';
                    it('returns 200 and a body containing the player requested', async function () {
                        const res = await app().get(`/api/v1/players/${playerName}`);
                        expect(res.status).to.equal(200);
                        const expectedPlayer = {name: 'craig'}
                        expect(res.body).to.deep.equal(expectedPlayer);
                    });
                });
            });
        });
    });
});