const rewire = require('rewire');

const { expect } = require('../../../setup/chai.setup');

const playersService = rewire('../../../../src/v1/services/players.service');

const getPlayer = playersService.__get__('getPlayer');

describe('players.service.js', function () {
    describe('getPlayer(name)', function() {
        describe('valid args', function () {
            describe('craig', function () {
                it(`returns the player 'craig'`, function () {
                    const result = getPlayer('craig');
                    expect(result).to.deep.include({ name: 'craig' });
                });
            });
        });
    });
});