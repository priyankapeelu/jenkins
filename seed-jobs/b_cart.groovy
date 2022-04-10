multibranchPipelineJob('CI-Pipelines/cart') {
    branchSources {
        git {
            id('12345678') //IMPORTANT: use a constant and unique identifier
            remote('https://github.com/priyankapeelu/cart.git')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numTokeep(20)
        }
    }
}


